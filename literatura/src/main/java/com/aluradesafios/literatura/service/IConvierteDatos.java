package com.aluradesafios.literatura.service;

public interface IConvierteDatos {
    <T>T obtenerDatos(String json, Class<T> clase);
}
