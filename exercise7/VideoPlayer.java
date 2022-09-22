package exercise7;

public class VideoPlayer {
  private Video video;

  public VideoPlayer(Video video){
    this.video = video;
  }

  public void play(){
    System.out.println(this.video.getContent()); 
  }
}
