import java.util.Scanner;
//import java.util.ArrayList;

public class Cadastro {
    public static void main(String[] args) {
		
		Aluno a = new Aluno();
		Scanner leia = new Scanner (System.in);
		a.endereco = new A_endereco();
		//ArrayList <Aluno> ArrAluno = new ArrayList<>();
		 
		System.out.println(" INFORMAÇÕES DO ALUNO ");
		
		System.out.println("Nome: ");
		a.nome = leia.nextLine();
		System.out.println("Semestre: ");
		a.semestre = leia.nextInt();
		System.out.println("Sala: ");
		a.sala = leia.nextInt();
		leia.nextLine();
		System.out.println("Curso: ");
		a.curso = leia.nextLine();
		for(int i = 0; i < 5; i++){
		System.out.printf("Nota: ");
		a.notas[i] = leia.nextDouble();
		}
        leia.nextLine();
        
		System.out.println(" **********Endereço************** ");
		System.out.println("Rua: ");
		a.endereco.rua = leia.nextLine();
		System.out.println("Bairro: ");
		a.endereco.bairro = leia.nextLine();
		System.out.println("Cidade: ");
		a.endereco.cidade = leia.nextLine();
		System.out.println("Estado: ");
		a.endereco.estado = leia.nextLine();
		System.out.println("CEP(Apenas 7 Digitos): ");
		a.endereco.cep = leia.nextInt();
		
		
		System.out.printf("\nNome: %s", a.nome);
		System.out.printf("\nSemestre: %s", a.semestre);
		System.out.printf("\nSala: %d", a.sala);
		System.out.printf("\nCurso: %d", a.curso);
		System.out.printf(" ");
		for(int i = 0; i < 5; i++){
		System.out.printf("\nNota: %.1f", a.notas[i]);
		}
		System.out.printf("\nRua: %s", a.endereco.rua,"\nBairro: %s", a.endereco.bairro,"\nCidade: %s", a.endereco.cidade,"\nEstado: %s", a.endereco.estado,"\nCEP: %s", a.endereco.cep);
		
		leia.close();
	}
}