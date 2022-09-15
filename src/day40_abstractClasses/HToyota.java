package day40_abstractClasses;

public abstract class HToyota extends GAraba{
    @Override
    public String marka() {
        return "Toyota";
    }

    public abstract void model();

    public abstract void uretimYeri();

}

