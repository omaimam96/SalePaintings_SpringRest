package it.contrader.dao;

import it.contrader.main.ConnectionSingleton;
import it.contrader.model.DatiAnagrafici;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DatiAnagraficiDAO {

    private final String QUERY_ALL= "SELECT * FROM datianagrafici";
    private final String QUERY_CREATE= "INSERT INTO datianagrafici (nome, cognome, genere, datadinascita," +
            "nazione,provincia,cittaResidenza,indirizzo";
    private final String QUERY_READ= "SELECT * FROM datianagrafici WHERE id=?";
    private final String QUERY_UPDATE= "UPDATE datianagrafici SET nome=?, cognome=?, genere=?, datadinascita=?," +
            "nazione=?,provincia=?,cittaResidenza=?,indirizzo=?";

    public DatiAnagraficiDAO(){

    }
    public List<DatiAnagrafici> getAll(){
        List<DatiAnagrafici> datiAnagraficiList= new ArrayList<>();
        Connection connection= ConnectionSingleton.getInstance();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY_ALL);
            DatiAnagrafici datiAnagrafici;
            while (resultSet.next()){
                int id= resultSet.getInt("id");
                String nome= resultSet.getString("nome");
                String cognome= resultSet.getString("cognome");
                String genere= resultSet.getString("genere");
                Date datadinascita= resultSet.getDate("datadinascita");
                String nazione= resultSet.getString("nazione");
                String provincia= resultSet.getString("provincia");
                String cittaResidenza= resultSet.getString("cittaResidenza");
                String indirizzo= resultSet.getString("indirizzo");
                datiAnagrafici= new DatiAnagrafici(nome, cognome, genere, datadinascita,
                        nazione,provincia,cittaResidenza,indirizzo);
                datiAnagrafici.setId(id);
                datiAnagraficiList.add(datiAnagrafici);
            }

        }catch(SQLException e){
            e.printStackTrace();

        }
        return datiAnagraficiList;
    }
    public boolean insert(DatiAnagrafici datiAnagraficiToInsert){
        Connection connection= ConnectionSingleton.getInstance();
        try{
            PreparedStatement preparedStatement= connection.prepareStatement(QUERY_CREATE);
            preparedStatement.setString(1, datiAnagraficiToInsert.getNome());
            preparedStatement.setString(2, datiAnagraficiToInsert.getCognome());
            preparedStatement.setString(3, datiAnagraficiToInsert.getGenere());
            preparedStatement.setDate(4, (java.sql.Date) datiAnagraficiToInsert.getDatadinascita());
            preparedStatement.setString(5, datiAnagraficiToInsert.getNazione());
            preparedStatement.setString(6, datiAnagraficiToInsert.getProvincia());
            preparedStatement.setString(7, datiAnagraficiToInsert.getCittaResidenza());
            preparedStatement.setString(8, datiAnagraficiToInsert.getIndirizzo());
            preparedStatement.execute();
            return true;

        }catch(SQLException e){
            return false;
        }
    }
    public DatiAnagrafici read(int datiAnagraficiId){

        Connection connection= ConnectionSingleton.getInstance();
        try{

            PreparedStatement preparedStatement= connection.prepareStatement(QUERY_READ);
            preparedStatement.setInt(1,datiAnagraficiId);
            ResultSet resultSet= preparedStatement.executeQuery();
            resultSet.next();
            String nome, cognome, genere, nazione, provincia,cittaResidenza,indirizzo;
            Date datadinascita;
            nome= resultSet.getNString("nome");
            cognome= resultSet.getString("cognome");
            genere= resultSet.getString("genere");
            datadinascita=resultSet.getDate("datadinascita");
            nazione= resultSet.getString("nazione");
            provincia= resultSet.getString("provincia");
            cittaResidenza=resultSet.getString("cittaResidenza");
            indirizzo= resultSet.getString("indirizzo");
            DatiAnagrafici datiAnagrafici= new DatiAnagrafici(nome,cognome,genere,datadinascita,nazione,provincia,
                    cittaResidenza,indirizzo);
            datiAnagrafici.setId(resultSet.getInt("id"));
            return datiAnagrafici;

        }catch (SQLException e){
            return null;
        }
    }
    public boolean update(DatiAnagrafici datiAnagraficiToUpdate){
        Connection connection= ConnectionSingleton.getInstance();
        if(datiAnagraficiToUpdate.getId()==0){
            return false;
        }
        DatiAnagrafici datiAnagraficiRead = read(datiAnagraficiToUpdate.getId());
        if (!datiAnagraficiRead.equals(datiAnagraficiToUpdate)){

        }
        return false;
    }
}