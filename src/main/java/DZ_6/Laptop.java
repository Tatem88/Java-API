package DZ_6;

public class Laptop {
    private int id;
    private int ssd_volume;
    private int ram_volume;
    private String os_type;
    private String color;
    private String brand;

    public Laptop(int id, int ssd_volume, int ram_volume, String os_type, String color,
                          String brand) {
        this.id = id;
        this.ssd_volume = ssd_volume;
        this.ram_volume = ram_volume;
        this.os_type = os_type;
        this.color = color;
        this.brand = brand;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ssd_volume;
        result = prime * result + id;
        result = prime * result + ((os_type == null) ? 0 : os_type.hashCode());
        result = prime * result + ram_volume;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (ssd_volume != other.ssd_volume)
            return false;
        if (id != other.id)
            return false;
        if (os_type == null) {
            if (other.os_type != null)
                return false;
        } else if (!os_type.equals(other.os_type))
            return false;
        if (ram_volume != other.ram_volume)
            return false;
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSSDvolume() {
        return ssd_volume;
    }

    public void setSSDvolume(int volume) {
        this.ssd_volume = volume;
    }

    public int getRAMvolume() {
        return ram_volume;
    }

    public void setRAMvolume(int volume) {
        this.ram_volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String name) {
        this.brand = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOStype() {
        return os_type;
    }

    public void setOStype(String type) {
        this.os_type = type;
    }

    @Override
    public String toString() {
        return "{id=" + id + ",  brand=" + brand + ", color=" + color + ", ssd_volume="
                + ssd_volume + ",  ram_volume=" + ram_volume+ ",  os_type=" + os_type+ "}";
    }


}