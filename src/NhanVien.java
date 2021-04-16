import java.time.LocalDate;

public abstract class NhanVien implements Comparable<NhanVien> {
    private String name;
    private boolean gioiTinh;
    private LocalDate ngaySinh;

    public NhanVien(String name,boolean gioiTinh, LocalDate ngaySinh) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.ngaySinh.compareTo(o.getNgaySinh());
    }

    public NhanVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", ngaySinh=" + ngaySinh +
                '}'+"\n";
    }
}
