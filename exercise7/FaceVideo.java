package exercise7;

import java.util.ArrayList;
import java.util.List;

public class FaceVideo extends Video{

    private final boolean[] bitsFace;

    public FaceVideo() {
       bitsFace = new boolean[] {
              false, true, false, true, false, false, false, false, false, true, true, false, false, false, false,
              true, false, true, true, true, false, false, true, false, false, true, true, false, false, false, false,
              true, false, true, true, false, false, false, true, false, true, true, true, false, true, false, false,
              true, false, true, true, false, true, true, true, false, false, true, true, true, false, false, true,
              true, false, false, true, false, true, true, false, false, false, false, true, false, false, false,
              false, false, false, true, true, true, false, true, true, false, false, true, true, false, false, false,
              true, true, false, false, true, false, false, false, false, false, false, true, true, false, false,
              false, true, true, false, true, true, false, true, true, true, true, false, true, true, false, true,
              true, true, false, false, true, true, true, false, false, true, true, false, true, true, false, false,
              true, false, true, false, true, true, false, false, true, true, true, false, true, true, true, false,
              true, false, true, false, true, true, false, true, false, false, true, false, true, true, true, false,
              true, false, true, false, false, true, false, true, true, true, false
       };
    }

    public boolean[] getBitsFace() {
        return bitsFace;
    }

    @Override
    public String getContent(){
      List<String> lista = new ArrayList<String>(23);
      String value = "";
      int position = 0;
      for (int i= 0; i < this.bitsFace.length; i++ ){
        int bit = this.bitsFace[i] ? 1 : 0;
        value = value + bit;
        if(i%8 == 7){
          lista.add(position, value);
          value = "";
          position++;
        }
      }
      String message = "";
      for (int i=0; i < lista.size(); i++){
        int num = Integer.parseInt(lista.get(i), 2);
        message = message + (char)num;
      }

      return message;
    };

}