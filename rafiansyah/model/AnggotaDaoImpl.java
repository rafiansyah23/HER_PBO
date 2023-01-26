/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafiansyah.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class AnggotaDaoImpl implements AnggotaDao{
private final List<Anggota> data = new ArrayList<>();
    
    
@Override
public Anggota save(Anggota anggota) {
        data.add(anggota);
        return anggota;
    }

    
    public Anggota update(int index, Anggota anggota) {
        data.set(index, anggota);
        return anggota;
    }

    @Override
    public void delete(int index) {
        data.remove(index);
    }

    @Override
    public Anggota getAnggota(int index) {
        return data.get(index);
    }

    @Override
    public List<Anggota> getAllAnggota() {
        return data;
    }
    
}
