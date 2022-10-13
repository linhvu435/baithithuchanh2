package ThiModule2.Class;

import java.util.Comparator;

public class Sapxeptheotangdan implements Comparator<HocSinh> {
    public  int compare(HocSinh o1,HocSinh o2){
        if(o1.DiemTB>o2.DiemTB){
            return 1;
        }
        return -1;
    }
}
