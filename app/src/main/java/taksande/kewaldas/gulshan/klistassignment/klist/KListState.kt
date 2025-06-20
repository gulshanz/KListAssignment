package taksande.kewaldas.gulshan.klistassignment.klist

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class KListState(
    val sections: List<KListSectionWrapper> = emptyList(),
    val padding: Dp = 0.dp
)
