package TaskExamTheory;

///  Фасад - паттер проектирования, который объединяет интерфейсы и предоставляет упрощенный интерфейс
// TODO РЕализовать фасад
public class Task14Fasade {

    /// ОТВЕТ!!!!!!
    public class Player {
        Audio audio;
        Video video;
        Image image;

        public Player() {
            this.audio = new Audio();
            this.video = new Video();
            this.image = new Image();
        }

        public void PlayMedia(String mediaType) {
            switch (mediaType) {
                case "Video":
                    video.VideoAction();
                    break;
                case "Audia":
                    audio.AudioAction();
                    break;
                case "Image":
                    image.ImageAction();
                    break;
            }
        }

        /// КОНЕЦ ОТВЕТА!!!!!!

    }

    public class Audio {

        public void AudioAction() {
            System.out.println("Audio on");
        }
    }
    public class Video {

        public void VideoAction() {
            System.out.println("Video on");
        }
    }
    public class Image {

        public void ImageAction() {
            System.out.println("Image show");
        }
    }
}

