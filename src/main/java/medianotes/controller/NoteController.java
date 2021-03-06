package medianotes.controller;


import medianotes.dto.NoteCreateDto;
import medianotes.dto.NoteDeleteDto;
import medianotes.dto.NoteDto;
import medianotes.dto.NoteEditDto;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {


    @GetMapping
    public List<NoteDto> getAllNotes() {

        return List.of(
                new NoteDto(1, "test-name", "text-text-text-text!"),
                new NoteDto(2, "test-name-3", "text-text-text-text!"),
                new NoteDto(3, "test-name-1251354324", "text-text-text-text!")
        );
    }

    @PostMapping
    public NoteDto createNote(@RequestBody NoteCreateDto noteCreateDto) {
        // todo когда-нибудь создать объект по-настоящему :)

        NoteDto noteDto = new NoteDto(
                10,
                noteCreateDto.getName(),
                noteCreateDto.getText()
        );

        return noteDto;
    }

    @PutMapping("/v1/test/{id}/hdawho")
    public NoteDto editNote(@RequestBody NoteEditDto noteEditDto,
                            @PathVariable("id") Integer noteId) {
        // todo когда-нибудь изменить объект по-настоящему в БД :)

        NoteDto noteDto = new NoteDto(
                noteId,
                "притворимся, что из БД",
                noteEditDto.getText()
        );

        return noteDto;
    }

    @DeleteMapping("/delete")
    public NoteDeleteDto deleteNote(@RequestBody NoteDeleteDto deleteDto){
        // todo когда-нибудь удалить/пометить на удаление объект(ы) изнастоящей БД :)

        return deleteDto;


    }
}
