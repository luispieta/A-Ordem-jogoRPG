package a.ordem.jogo.controller;

import a.ordem.jogo.raca.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("racas")
public class RacaController {

    @Autowired
    private RacaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrarRaca(@RequestBody @Valid DadosCadastroRaca dados) {
        repository.save(new Raca(dados));
    }

    @GetMapping
    public List<DadosListagemRaca> listarRaca() {
        return repository.findAll().stream().map(DadosListagemRaca::new).toList();
    }

    @PutMapping
    @Transactional
    public void alterarRaca(@RequestBody @Valid DadosAlteracaoRaca dados) {
        var raca = repository.getReferenceById(dados.id());
        raca.informacoesAtualizadasRaca(dados);
    }

    @GetMapping("/{id}")
    public ResponseEntity buscaPorId(@PathVariable Long id) {
        var raca = repository.getReferenceById(id);
        return ResponseEntity.ok(new DadosDetalhamentoRaca(raca));
    }

}
