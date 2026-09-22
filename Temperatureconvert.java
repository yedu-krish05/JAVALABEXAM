class Temperatureconvert { 
    double celsius; 
    Temperatureconvert (double celsius) { 
        this.celsius = celsius; 
    } 
    void convert() { 
        double fahrenheit = (celsius * 9 / 5) + 32; 
        System.out.println("Celsius: " + celsius); 
        System.out.println("Fahrenheit: " + fahrenheit); 
    } 
    public static void main(String[] args) { 
        Temperatureconvert t = new Temperatureconvert(25); 
        t.convert(); 
    } 
} 