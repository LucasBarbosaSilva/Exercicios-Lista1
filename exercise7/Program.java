package exercise7;

public class Program {
  public static void main(String[] args) {
    YoutubeVideo youVideo = new YoutubeVideo();
    FaceVideo faceVideo = new FaceVideo();
    VideoPlayer youtubePlayer = new VideoPlayer(youVideo);
    VideoPlayer facePlayer = new VideoPlayer(faceVideo);
    youtubePlayer.play();
    facePlayer.play();
  }
}
