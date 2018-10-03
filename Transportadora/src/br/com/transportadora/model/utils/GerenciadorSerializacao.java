package br.com.transportadora.model.utils;

import br.com.transportadora.model.Transportadora;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Path;


public class GerenciadorSerializacao {

  private static final Path path = FileSystems.getDefault().getPath(System.getProperty("user.home"), "Transportadora.bin");

  public static void salvarTransportadora(Transportadora transportadora) throws FileNotFoundException, IOException {
    FileOutputStream arquivo = new FileOutputStream(path.toString());
    ObjectOutputStream saida = new ObjectOutputStream(arquivo);
    saida.writeObject(transportadora);
    saida.close();
  }

  public static Transportadora carregarTransportadora() throws FileNotFoundException, IOException, ClassNotFoundException {
    FileInputStream inputArquivo = new FileInputStream(path.toString());
    ObjectInputStream entrada = new ObjectInputStream(inputArquivo);
    Transportadora transportadora = (Transportadora) entrada.readObject();
    entrada.close();
    return transportadora;
  }

}
