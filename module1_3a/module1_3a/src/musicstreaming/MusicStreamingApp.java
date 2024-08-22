package musicstreaming;

public class MusicStreamingApp {

	public static void main(String[] args) {
        // Create music sources
        MusicSource localFile = new LocalFileAdapter(new LocalFileMusicSource("song.mp3"));
        MusicSource onlineStream = new OnlineStreamingServiceAdapter(new OnlineStreamingServiceMusicSource("http://streaming.service.com/song"));
        MusicSource radioStation = new RadioStationAdapter(new RadioStationMusicSource("Cool FM"));

        // Decorate music sources
        MusicSource localFileWithEqualizer = new EqualizerDecorator(localFile);
        MusicSource onlineStreamWithVolumeControl = new VolumeControlDecorator(onlineStream);
        MusicSource radioWithBothFeatures = new VolumeControlDecorator(new EqualizerDecorator(radioStation));

        // Play music with various features
        localFileWithEqualizer.play();
        onlineStreamWithVolumeControl.play();
        radioWithBothFeatures.play();
    }
}
