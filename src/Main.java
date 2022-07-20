import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main (String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDebora = new Dev();
        devDebora.setNome("Debora");
        devDebora.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Debora" + devDebora.getConteudosInscritos());
        devDebora.progredir();
        devDebora.progredir();
        System.out.println("-")
        System.out.println("Conteudos Inscritos Debora" + devDebora.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Debora" + devDebora.getConteudosConcluidos());
        System.out.println("XP:" + devDebora.calcularTotalXp());

        System.out.println("-------");

        Dev devCristina = new Dev();
        devCristina.setNome("Cristina");
        devCristina.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devCristina.getConteudosInscritos());
        devCristina.progredir();
        devCristina.progredir();
        devCristina.progredir();
        System.out.println("-")
        System.out.println("Conteudos Inscritos" + devCristina.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devCristina.getConteudosConcluidos());
        System.out.println("XP:" + devCristina.calcularTotalXp());

    }
}
