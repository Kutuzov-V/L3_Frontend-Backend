package medianotes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class NoteDeleteDto {
    List<Integer> notes;
    public NoteDeleteDto(@JsonProperty("list_id") List<Integer> listId) {
        this.notes = listId;
    }

}
