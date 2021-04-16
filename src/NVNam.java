import java.time.LocalDate;

public class NVNam extends NhanVien{
    public NVNam(String name, LocalDate ngaySinh) {
        super(name, true, ngaySinh);
    }

    public NVNam() {
    }
}
