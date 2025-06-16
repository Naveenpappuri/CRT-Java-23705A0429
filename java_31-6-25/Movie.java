public class Movie{
    String name;
    int rating;
    String duration;
    public Movie( String name, int rating, String duration){
        this.name = name;
        this.rating = rating;
        this.duration = duration;
    }
    public boolean Is_hit(){
        if(rating > 7) {
            return true;
        }
        return false;
    }
    public void details(){
        System.out.println("Name of the movie: "+name);
        System.out.println("Rating out of 10: "+rating);
        System.out.println("Movie duration in hh:mm format: "+duration);
        System.out.println("Is movie HIT: " +Is_hit());
    }
    public static void main(String[] args) {
        Movie cinema = new Movie("Chatrapathi",8,"02h:40m");
        cinema.details();
    }
}


