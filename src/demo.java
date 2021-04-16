import java.time.LocalDate;
import java.util.*;

public class demo {
    public static void main(String[] args) {
        List listNhanVien = new ArrayList();
        Queue listNVNu = new ArrayDeque();
        Queue listNVNam = new ArrayDeque();
        listNhanVien.add(new NVNu("ly", LocalDate.of(1998,5,12)));
        listNhanVien.add(new NVNu("huyen", LocalDate.of(1995,6,2)));
        listNhanVien.add(new NVNu("loan", LocalDate.of(1997,8,7)));
        listNhanVien.add(new NVNam("cong", LocalDate.of(1996,2,13)));
        listNhanVien.add(new NVNam("toan", LocalDate.of(1994,8,5)));
        listNhanVien.add(new NVNam("hoang", LocalDate.of(2000,6,12)));


        Collections.sort(listNhanVien);


        for (Object nhanVien:listNhanVien
             ) {
            if(nhanVien instanceof NVNam){
                listNVNam.add(nhanVien);
            }
            else {
                listNVNu.add(nhanVien);
            }
        }
        System.out.println(listNVNu);
        System.out.println(listNVNam);

    }
}
