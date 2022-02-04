import br.com.Bootcamp;
import br.com.Curso;
import br.com.Dev;
import br.com.Mentoria;
import br.com.utils.CLI;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java1");
        curso1.setDescricao("Descrição Java1");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        CLI.imprimirMsg("Conteúdos Inscritos Lucas:\n" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        CLI.imprimirContinuacao();
        CLI.imprimirMsg("Conteúdos Inscritos Lucas:" + devLucas.getConteudosInscritos());
        CLI.imprimirMsg("Conteúdos Concluídos Lucas:" + devLucas.getConteudosConcluidos());
        CLI.imprimirMsg("XP:" + devLucas.calcularTotalXp());

        CLI.imprimirDash();

        Dev devBrendon = new Dev();
        devBrendon.setNome("Brendon");
        devBrendon.inscreverBootcamp(bootcamp);
        CLI.imprimirMsg("Conteúdos Inscritos Brendon:" + devBrendon.getConteudosInscritos());
        devBrendon.progredir();
        devBrendon.progredir();
        devBrendon.progredir();
        devBrendon.progredir();
        CLI.imprimirContinuacao();
        CLI.imprimirMsg("Conteúdos Inscritos Brendon:" + devBrendon.getConteudosInscritos());
        CLI.imprimirMsg("Conteúdos Concluidos Brendon:" + devBrendon.getConteudosConcluidos());
        CLI.imprimirMsg("XP: " + devBrendon.calcularTotalXp());

    }

}
