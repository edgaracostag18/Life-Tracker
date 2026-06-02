package com.grit.liferecorder.ui.components
import androidx.compose.foundation.layout.*; import androidx.compose.material3.*; import androidx.compose.runtime.*; import androidx.compose.ui.Modifier; import androidx.compose.ui.unit.dp
@Composable fun EmptyState(text:String){ Text(text, modifier=Modifier.padding(24.dp), color=MaterialTheme.colorScheme.onSurfaceVariant) }
@Composable fun ConfirmDeleteDialog(show:Boolean,onConfirm:()->Unit,onDismiss:()->Unit){ if(show) AlertDialog(onDismissRequest=onDismiss,confirmButton={TextButton(onClick=onConfirm){Text("Delete")}},dismissButton={TextButton(onClick=onDismiss){Text("Cancel")}},title={Text("Delete item?")},text={Text("This cannot be undone.")}) }
@Composable fun CategoryChip(label:String){ AssistChip(onClick={},label={Text(label)}) }
@Composable fun ProjectChip(label:String){ AssistChip(onClick={},label={Text(label)}) }
@Composable fun LabelChip(label:String){ AssistChip(onClick={},label={Text(label)}) }
@Composable fun SimpleTextField(value:String,onChange:(String)->Unit,label:String,modifier:Modifier=Modifier){ OutlinedTextField(value=value,onValueChange=onChange,label={Text(label)},modifier=modifier.fillMaxWidth()) }
