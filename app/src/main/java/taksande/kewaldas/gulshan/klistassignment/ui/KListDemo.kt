package taksande.kewaldas.gulshan.klistassignment.ui

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import taksande.kewaldas.gulshan.klistassignment.klist.*

@Composable
fun KListDemo() {
    val context = LocalContext.current
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


    KList.create().padding(16.dp).section("Top Gainers", gainers, onItemClick = {
            Toast.makeText(context, "Clicked on ${it.name} Parent", Toast.LENGTH_SHORT).show()
        }) {
            KListItem(it) {
                Toast.makeText(context, "Clicked on ${it.name}", Toast.LENGTH_SHORT).show()
            }

        }.section("Top Losers", losers, onItemClick = {
            Toast.makeText(context, "Clicked on ${it.name} Parent", Toast.LENGTH_SHORT).show()
        }) {
            KListItem(it) {
                Toast.makeText(context, "Clicked on ${it.name}", Toast.LENGTH_SHORT).show()
            }
        }.Render()
}
