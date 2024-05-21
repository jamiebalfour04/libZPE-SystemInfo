import jamiebalfour.zpe.core.ZPEStructure;
import jamiebalfour.zpe.interfaces.ZPECustomFunction;
import jamiebalfour.zpe.interfaces.ZPELibrary;
import oshi.SystemInfo;

import java.util.HashMap;
import java.util.Map;

public class Plugin implements ZPELibrary {

  @Override
  public Map<String, ZPECustomFunction> getFunctions() {
    HashMap<String, ZPECustomFunction> arr = new HashMap<String, ZPECustomFunction>();

    return arr;
  }

  @Override
  public Map<String, Class<? extends ZPEStructure>> getObjects() {
    return null;
  }

  @Override
  public String getName() {
    return "libZPE-SystemInfo";
  }

  @Override
  public String getVersionInfo() {
    return "1.0";
  }


  public static void main(String[] args){
    SystemInfo s = new SystemInfo();
    System.out.println(s.getHardware().getDiskStores());
  }
}
