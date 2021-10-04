/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * Copyright (c) 2018, Dalton <delps1001@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.owain.autohop;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("WildyAutoHop")
public interface AutoHopConfig extends Config
{
	@ConfigItem(
			keyName = "disableGrandExchange",
			name = "Disable at Grand Exchange",
			description = "Don't hop if your player is at the grand exchange",
			position = 1
	)
	default boolean disableGrandExchange()
	{
		return false;
	}

	@ConfigItem(
			keyName = "disableFeroxEnclave",
			name = "Disable at Ferox Enclave",
			description = "Don't hop if your player is at the Ferox Enclave",
			position = 2
	)
	default boolean disableFeroxEnclave()
	{
		return true;
	}

	@ConfigItem(
			keyName = "cmbBracket",
			name = "Within combat bracket",
			description = "Only hop if the player is within your combat bracket",
			position = 3
	)
	default boolean cmbBracket()
	{
		return true;
	}

	@ConfigItem(
			keyName = "alwaysHop",
			name = "Hop on player spawn",
			description = "Hop when a player  spawns",
			position = 4
	)
	default boolean alwaysHop()
	{
		return true;
	}

	@ConfigItem(
			keyName = "chatHop",
			name = "Hop on chat message",
			description = "Hop whenever any message is entered into chat",
			position = 5
	)
	default boolean chatHop()
	{
		return false;
	}

	@ConfigItem(
			keyName = "hopRadius",
			name = "Hop radius",
			description = "Hop only when another player enters radius",
			position = 6
	)
	default boolean hopRadius()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playerRadius",
			name = "Player radius",
			description = "Radius (tiles) for player to be within to trigger hop",
			position = 7,
			hidden = true,
			unhide = "hopRadius"
	)
	default int playerRadius()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "skulledHop",
			name = "Skulled",
			description = "Hop when a player within your combat bracket spawns that has a skull",
			position = 8,
			hide = "alwaysHop"
	)
	default boolean skulledHop()
	{
		return true;
	}

	@ConfigItem(
			keyName = "underHop",
			name = "Log under",
			description = "Hop when a player within your combat bracket spawns underneath you",
			position = 9,
			hide = "alwaysHop"
	)
	default boolean underHop()
	{
		return true;
	}

	@ConfigItem(
			keyName = "returnInventory",
			name = "Return to inventory",
			description = "Return to inventory after hopping",
			position = 10
	)
	default boolean returnInventory()
	{
		return false;
	}

	@ConfigItem(
			keyName = "american",
			name = "American worlds",
			description = "Allow hopping to American worlds",
			position = 13
	)
	default boolean american()
	{
		return true;
	}

	@ConfigItem(
			keyName = "unitedkingdom",
			name = "UK worlds",
			description = "Allow hopping to UK worlds",
			position = 14
	)
	default boolean unitedkingdom()
	{
		return true;
	}

	@ConfigItem(
			keyName = "germany",
			name = "German worlds",
			description = "Allow hopping to German worlds",
			position = 15
	)
	default boolean germany()
	{
		return true;
	}

	@ConfigItem(
			keyName = "australia",
			name = "Australian worlds",
			description = "Allow hopping to Australian worlds",
			position = 16
	)
	default boolean australia()
	{
		return true;
	}

	@ConfigItem(
			keyName = "friends",
			name = "Ignore Friends",
			description = "Don't hop when the player spawned is on your friend list",
			position = 18
	)
	default boolean friends()
	{
		return true;
	}

	@ConfigItem(
			keyName = "clanmembers",
			name = "Ignore Clan members",
			description = "Don't hop when the player spawned is in your clan chat",
			position = 19
	)
	default boolean clanmember()
	{
		return true;
	}
}