package I;
import java.io.*;
import java.time.LocalDateTime;

public class Configuration
{
    private static Configuration instance;
    private String config = "";
    private String key = "99FG";

    private Configuration() {}

    public String get(String key)
    {
        if(this.key.equals(key))
            if(!config.equals(""))
                return config;
            else
                return "Конфиг не загружен";
        return "Неверный ключ";
    }
    public static Configuration getInstance()
    {
        if(instance == null)
                instance = new Configuration();
        return instance;
    }
    public void loadConfig(String fileName)
    {
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            line = br.readLine();
            config = line;
            br.close();
        }
        catch (IOException e) {e.printStackTrace();}
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true)))
        {
            LocalDateTime now = LocalDateTime.now();
            bw.write(!line.equals("") ? "\n|Config: " + line + "|\t|": "\n|Конфиг не был загружен. ");
            bw.write("Время загрузки по МСК: " + now.toString() + "|");
            bw.close();
        }
        catch (IOException e) {e.printStackTrace();}
    }
}
