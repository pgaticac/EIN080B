package clases;

public class Perro extends Animal {
    
    @Override
    public String comunicar() {
       
        return "guau!";
    }

    public String comunicar(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += "guau! ";
        }
        return s;
    }

}
