package controllers;

import helpers.Alerta;
import main.Main;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Login Controller.
 */
public class LoginCtrl implements Initializable {

    // ATRIBUTOS DA VIEW
    @FXML
    TextField campoMatriculaDoAluno;

    @FXML
    Button botaoLoginAluno;

    @FXML
    TextField campoLoginDoFuncionario;

    @FXML
    PasswordField campoSenhaDoFuncionario;

    @FXML
    Button loginDoFuncionario;

    @FXML
    Label errorMessage;

    // ATRIBUTOS DO CONTROLLER
    private Main application;

    // SETAPP
    public void setApp(Main application) {
        this.application = application;
    }

    // PROCEDIMENTOS DE INICIALIZAÇÃO DO CONTROLLER
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        errorMessage.setText("");
//        userId.setPromptText("demo");
//        password.setPromptText("demo");

    }

    // MÉTODOS DO CONTROLLER
    public void loginDoFuncionario(ActionEvent event) throws SQLException, NoSuchAlgorithmException {
        if (application.loginDoFuncionario(campoLoginDoFuncionario.getText(), campoSenhaDoFuncionario.getText())) {
            errorMessage.setText("Usuário e/ou Senha Inválidos");
        }
    }

    public void loginDoAluno(ActionEvent event) throws SQLException, NoSuchAlgorithmException {
        if (application.loginDoAluno(campoMatriculaDoAluno.getText())) {
            errorMessage.setText("Usuário e/ou Senha Inválidos");
        }

    }

    public void alterarSenha(ActionEvent event) throws SQLException, NoSuchAlgorithmException {

        if (true) {
            Alerta.informar("Digite a nova senha no campo");
        } else {
            Alerta.informar("invalido");
        }

    }
}
