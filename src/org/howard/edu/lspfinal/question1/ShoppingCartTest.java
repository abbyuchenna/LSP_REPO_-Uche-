package org.howard.edu.lspfinal.question1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    @DisplayName("Test adding valid item")
    public void testAddValidItem() {
        cart.addItem("Laptop", 999.99);
        assertEquals(1, cart.getItemCount());
    }

    @Test
    @DisplayName("Test adding zero price item")
    public void testAddZeroPriceItem() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cart.addItem("FreeItem", 0.0);
        });
        assertTrue(exception.getMessage().contains("Price must be positive"));
    }

    @Test
    @DisplayName("Test applying discount")
    public void testApplyDiscount() {
        cart.addItem("Item1", 100.0);
        cart.applyDiscount("SAVE10");
        assertEquals(90.0, cart.getTotal());
    }
}