package it.contrader.converter;

import it.contrader.dto.ImageDTO;
import it.contrader.model.Image;
import it.contrader.model.Negozio;
import org.springframework.stereotype.Component;

@Component
public class ImageConverter extends AbstractConverter<Image, ImageDTO> {

    @Override
    public Image toEntity(ImageDTO imageDTO) {
        Image image = null;
        if (imageDTO != null) {
            image = new Image(imageDTO.getId(), imageDTO.getImage(), imageDTO.getQuadro());
        }
        return image;
    }

    @Override
    public ImageDTO toDTO(Image image) {
        ImageDTO imageDTO = null;
        if (image != null) {
            imageDTO = new ImageDTO(image.getId(), image.getImage(), image.getQuadro());
        }
        return imageDTO;
    }
}
