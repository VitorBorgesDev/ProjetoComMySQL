package Main;

import FuncionarioRepository.FuncionarioRepository;
import funcionarios.Funcionarios;

import java.sql.SQLException;
import java.util.List;

public class MainTest {
    public static void main(String[] args) throws SQLException {


        // INSERIR
        FuncionarioRepository repo = new FuncionarioRepository();
        repo.save(new Funcionarios("Ana", "Silva", 25.50, "2024-01-15"));
        repo.save(new Funcionarios("Carlos", "Souza", 30.00, "2023-06-01"));
        repo.save(new Funcionarios("Vitor", "Gabriel", 30.00, "2026-10-02"));


        // Lista Todos
        System.out.println("\n--- Todos os funcionários ---");
        List<Funcionarios> todos = repo.findAll();
        for (Funcionarios e : todos) {
            System.out.println(e);
        }

        // Buscar por ID
        System.out.println("\n--- Buscar ID 1 ---");
        Funcionarios encontrado = repo.findById(1);
        System.out.println(encontrado);


        // deletar
        System.out.println("\n--- Deletar ID 2 ---");
        repo.delete(2);


        // Listar de novo para confirmar
        System.out.println("\n--- Lista final ---");
        repo.findAll().forEach(System.out::println);

    }
}
