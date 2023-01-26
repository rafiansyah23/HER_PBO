/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasBuku.model;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface BukuDao {
    Buku save(Buku buku);
    Buku update(int index, Buku sbuku);
    void delete(int index);
    Buku getBuku (int index);
    List<Buku>getAllBuku();
}
