package musicstreaming;

public class MusicStreamingApp {
	public static void main(String[] args) {
        // Create music sources
        MusicSource localFile = new LocalFileMusicSource("song.mp3");
        MusicSource onlineStream = new OnlineStreamingServiceMusicSource("http://streaming.service.com/song");
        MusicSource radioStation = new RadioStationMusicSource("Cool FM");

        // Bridge Pattern: Create playback instances
        Playback basicLocalPlayback = new BasicPlayback(localFile);
        Playback advancedOnlinePlayback = new AdvancedPlayback(onlineStream);
        
        // Decorator Pattern: Add features to playback
        Playback localPlaybackWithEqualizer = new EqualizerDecorator(basicLocalPlayback);
        Playback onlinePlaybackWithVolumeControl = new VolumeControlDecorator(advancedOnlinePlayback);
        Playback radioWithBothFeatures = new VolumeControlDecorator(new EqualizerDecorator(new BasicPlayback(radioStation)));

        // Play music with various features
        localPlaybackWithEqualizer.play();
        onlinePlaybackWithVolumeControl.play();
        radioWithBothFeatures.play();
    }
}

