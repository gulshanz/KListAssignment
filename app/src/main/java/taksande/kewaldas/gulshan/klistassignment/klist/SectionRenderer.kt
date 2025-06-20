package taksande.kewaldas.gulshan.klistassignment.klist

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun <T> SectionRenderer(
    header: String,
    items: List<T>,
    onItemClick: ((T) -> Unit)?,
    itemContent: @Composable (T) -> Unit
) {
    Column {
        Text(
            text = header,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp, horizontal = 8.dp),
            color = MaterialTheme.colorScheme.onBackground
        )


        items.forEachIndexed { index, item ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onItemClick?.invoke(item) }
                    .padding(8.dp)
            ) {
                itemContent(item)

                if (index < items.lastIndex) {
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                }
            }
        }
    }
}
