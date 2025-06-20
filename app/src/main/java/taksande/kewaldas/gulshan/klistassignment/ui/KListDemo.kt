package taksande.kewaldas.gulshan.klistassignment.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import taksande.kewaldas.gulshan.klistassignment.klist.*

@Composable
fun KListDemo() {
    val gainers = listOf(
        Coin("Bitcoin", "$67,420"),
        Coin("Ethereum", "$3,120"),
        Coin("Solana", "$156.22"),
        Coin("Avalanche", "$39.98"),
        Coin("Polkadot", "$6.88"),
        Coin("Cardano", "$0.45")
    )

    val losers = listOf(
        Coin("Dogecoin", "$0.058"),
        Coin("Shiba Inu", "$0.0000078"),
        Coin("Pepe", "$0.0000014"),
        Coin("Fantom", "$0.42"),
        Coin("Harmony", "$0.011")
    )


    KList.create()
        .padding(16.dp)
        .section("Top Gainers", gainers, onItemClick = {
            println("Clicked on Gainer: ${it.name}")
        }) {
            KListItem(it) {
                println("Clicked on ${it.name}")
            }

        }
        .section("Top Losers", losers, onItemClick = {
            println("Clicked on Loser: ${it.name}")
        }) {
            KListItem(it) {
                println("Clicked on ${it.name}")
            }
        }
        .Render()
}
