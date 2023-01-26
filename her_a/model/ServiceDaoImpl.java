/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package her_a.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ServiceDaoImpl implements ServiceDao {
    private List<Service> data = new ArrayList<Service>();

    @Override
    public Service save(Service service) {
        data.add(service);
        return service;
    }

    @Override
    public Service update(int index, Service service) {
        data.set(index, service);
        return service;
    }

    @Override
    public void delete(int index) {
        data.remove(index); 
    }

    @Override
    public Service getService(int index) {
        return data.get(index); 
    }

    @Override
    public List<Service> getAllService() {
        return data; 
    }

    @Override
    public Service Hitung(int hasil) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
    
}
