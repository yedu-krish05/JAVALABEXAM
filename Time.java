class Time { 
    int hours; 
    int minutes; 
    int seconds; 
    Time(int hours, int minutes, int seconds) { 
        this.hours = hours; 
        this.minutes = minutes; 
        this.seconds = seconds; 
    } 
    void display() { 
        System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds); 
    } 
    public static void main(String[] args) { 
        Time t = new Time(9, 5, 7); 
        t.display(); 
    } 
} 