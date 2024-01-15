public class Studant {

    //fields
    private String _name;
    private String _fName;
    private long _ID;
    private int _year;

    public Studant(String name, String fName, long ID, int year)
    {
        this._name = name;
        this._fName = fName;
        this._ID = ID;
        this._year = year;

    }
    public Studant(Studant other)
    {
        this._year = other._year;
        this._ID = other._ID;
        this._fName = other._fName;
        this._name = other._name;
    }
    public boolean overYear1()
    {
        return this._year > 1 && this._year < 4;
    }

}
