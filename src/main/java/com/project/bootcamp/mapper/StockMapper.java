package com.project.bootcamp.mapper;

import com.project.bootcamp.model.Stock;
import com.project.bootcamp.model.dto.StockDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StockMapper {

    //Método para transformar um DTO em uma ENTIDADE
    //Salvar os dados no BD
    public Stock toEntity(StockDTO dto) {
        Stock stock = new Stock();
        stock.setId(dto.getId());
        stock.setName(dto.getName());
        stock.setPrice(dto.getPrice());
        stock.setVariation(dto.getVariation());
        stock.setDate(dto.getDate());

        return stock;
    }

    //Método para transformar uma ENTIDADE em um DTO
    //Mostrar os dados no FRONTEND
    public StockDTO toDto(Stock stock) {
        StockDTO dto = new StockDTO();

        dto.setId(stock.getId());
        dto.setName(stock.getName());
        dto.setPrice(stock.getPrice());
        dto.setVariation(stock.getVariation());
        dto.setDate(stock.getDate());

        return dto;
    }

    //Método que recebe uma lista de entidade e retorna uma lista de DTO
    /*
     Percorrendo a lista de entidade(listStock.stream()) e
     convertendo a lista para DTO(.map(this::toDto)) e
     convertendo para uma lista do tipo List(.collect(Collectors.toList())) e
     retornando um DTO (List<StockDTO>)
    */
    public List<StockDTO> toDto(List<Stock> listStock){
        return listStock.stream().map(this::toDto).collect(Collectors.toList());
    }
}
