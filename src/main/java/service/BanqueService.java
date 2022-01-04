package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import metier.Compte;
@WebService
public class BanqueService {
    @WebMethod
    public double conversion(@WebParam(name ="mt") double mt){
        return mt*10;
    }
    @WebMethod
	public Compte consulterCompte(@WebParam(name ="code") int code){
        Compte compte=new Compte(1,Math.random()*9000,new Date());

        return compte;
    }
    @WebMethod
	public List<Compte> listComptes(){
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(1,Math.random()*9000,new Date()));
        comptes.add(new Compte(2,Math.random()*9000,new Date()));
        comptes.add(new Compte(3,Math.random()*9000,new Date()));

        return comptes;
    }
}
