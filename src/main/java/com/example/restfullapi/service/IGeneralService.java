package com.example.restfullapi.service;

import java.util.List;

public interface IGeneralService <E>{
    List<E> findAll();
    E findById(int id);
    E save(E e);
    void remove(int id);
}
