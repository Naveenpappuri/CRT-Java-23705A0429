public class Game{
   String title;
   float rating;
   String genre;
   int playCount;
   public Game(String title,String genre,int playCount,float rating){
        this.title = title;
        this.genre = genre;
        this.playCount = playCount;
        this.rating = rating;
   }
   public void Displayinfo(){
    System.out.println("----------Information about game------------");
    System.out.println("Title of the Game: "+title);
    System.out.println("Genre: "+genre);
    System.out.println("Play count: "+playCount);
    System.out.println("rating for game: "+rating);
   }
   public boolean IsFamilyFriendly(){
    if(genre == "horror"){
        return false;
    }
    return true;
   }
   public void play_count(){
    System.out.println("Game is running...");
    playCount++;
   }
   public void summary(){
    System.out.println("---------------Summary of game--------------");
    System.out.println("Game title: "+title);
    System.out.println("Genre: "+genre);
    System.out.println("Play count: "+playCount);
    System.out.println("rating for game: "+rating);
    System.out.println("Is the game is Family friendly: "+IsFamilyFriendly());
   }
   public static void main(String[] args){
    Game Game_info = new Game("Rugbee","Physical game",20,8.74f);
    Game_info.Displayinfo();
    Game_info.play_count();
    Game_info.summary(); 
   }
}