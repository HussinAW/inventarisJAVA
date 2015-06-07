/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbinventarisjava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.InputMismatchException;
import java.sql.SQLException;
import java.util.InputMismatchException;
/**
 *
 * @author Toshiba
 */
public abstract class super_abstrack {
    public abstract double Analisis();
    public abstract double tampil();
    public abstract void database();
}