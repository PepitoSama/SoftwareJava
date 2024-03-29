import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Bookmarks_dl {
	
	public static void main(String[] args) {
		String url = "http://personal.psu.edu/xqz5228/jpg.jpg";
		String file = getFile(url);
        store(file, getName(url.toString()), getExtension(url.toString()));
        System.out.println("Done !");
    }

    private static String readStream(InputStream in) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {
            String nextLine = "";
            while ((nextLine = reader.readLine()) != null) {
                sb.append(nextLine + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
    private static void store(String file, String name, String extension) {
    	
    	// Creation du dossier file (si non existant)
    	String directory = System.getProperty("user.dir");
    	directory += "/file/";
    	try {
    		new File(directory).mkdir( );
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    	// Creation du dossier extension (si non existant)
    	directory += extension;
    	try {
    		new File(directory).mkdir( );
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	directory += "/";
    	directory += name;
    	directory += ".";
    	directory += extension;
    	
    	try {
    		File outputFile = new File(directory);
    		FileWriter out = new FileWriter(outputFile);
    		out.write(file);
    		out.close();
    	} catch (Exception e) {
    		System.out.println("Error store : " + e.getMessage());
    	}
    }
    
    public static String getExtension(String url) {
    	String[] tab0 = url.split("\\/");
    	String[] tab1 = tab0[tab0.length-1].split("\\.");
    	String extension = tab1[tab1.length-1];
		return extension;
    }
    
    public static String getName(String url) {
    	String[] tab0 = url.split("\\/");
    	String[] tab1 = tab0[tab0.length-1].split("\\.");
    	String name = tab1[tab1.length-2];
		return name;
    }
    
    public static String getFile(String url) {
    	try {
    		URL toDl = new URL(url);
	        DataInputStream in = new DataInputStream(toDl.openStream());
	        String file = new String();
	        String buffer = new String();
	        while ((buffer = in.readLine()) != null) {
	        	file += buffer;
//	        	System.out.println(buffer);
	        }
	        in.close();
	        return file;
    	} catch (Exception e) {
    		System.out.println("Error getFile : " + e.getMessage());
    	}
    	return null;
    }
}
