package com.upa.mountsandmore.item;

import com.upa.mountsandmore.mountsandmore;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(mountsandmore.MOD_ID);
    public static final DeferredItem<Item> SHEEPMOUNT = ITEMS.registerItem("sheep_mount",
            Item::new, new Item.Properties());
    // -------------------------

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}