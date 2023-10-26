package Arquitectura.Inventario.controller;

import Arquitectura.Inventario.model.dto.InventoryDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles("test")
class InventoryControllerTest {

    @Test
    void showAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void showById() {
        InventoryDto producto = new InventoryDto(1,"peras",20);
        Assertions.assertEquals(producto,producto );

    }
}