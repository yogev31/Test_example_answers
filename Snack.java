public class Snack {
    private String _name;
    private double _price;
    public Snack(String name, double price)
    {
        this._name = name;
        this._price = price;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }
}
