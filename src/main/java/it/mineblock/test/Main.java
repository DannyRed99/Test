package it.mineblock.test;

import it.mineblock.mbcore.Chat;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Copyright © 2017 by Dylan Martin Longo
 * All rights reserved. No part of this code may be reproduced, distributed, or transmitted in any form or by any means,
 * including photocopying, recording, or other electronic or mechanical methods, without the prior written permission
 * of the creator.
 */
public class Main extends JavaPlugin {

    public void onEnable() {
        Chat.getLogger("&eTest &a&lloaded&e!", "info");
    }

    public void onDisable() {
        Chat.getLogger("&eTest &c&lunloaded&e!", "info");
    }

}
