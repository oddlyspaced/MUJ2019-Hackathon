package com.oddlyspaced.myapplication.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.oddlyspaced.myapplication.Adapter.HistoryAdapter
import com.oddlyspaced.myapplication.Modal.HistoryModal
import com.oddlyspaced.myapplication.R
import kotlinx.android.synthetic.main.fragment_history.view.*

class HistoryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = layoutInflater.inflate(R.layout.fragment_history, container, false)
        val list : ArrayList<HistoryModal> = ArrayList();
        list.add(HistoryModal("8:45", "Dr. Shreeyans Bahadkar", "Fever"))
        view.rvHistory.layoutManager = LinearLayoutManager(context)
        view.rvHistory.adapter = HistoryAdapter(list, context)
        return view
    }

}