package com.example.andersenhw5_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.andersenhw5_fragments.ListContact.contactlist
import com.example.andersenhw5_fragments.databinding.Fragment1Binding


class Fragment1 : Fragment() {

private lateinit var binding: Fragment1Binding
private val data: ModelData by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.apply {
            contact1.text = contactlist[0].name
            contact2.text = contactlist[1].name
            contact3.text = contactlist[2].name
            contact4.text = contactlist[3].name
            contact5.text = contactlist[4].name
            pushToFragment()
        }

    }
    private fun openFragment () {
        val screenMode = context?.resources?.configuration?.smallestScreenWidthDp
        if (screenMode!! >= 600) {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.holderFragment2, Fragment2.newInstance())
                ?.addToBackStack(null)
                ?.commit()
        } else {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.holderFragment, Fragment2.newInstance())
                ?.addToBackStack(null)
                ?.commit()
        }
    }

    private fun pushToFragment () {
        binding.apply {
            contact1.setOnClickListener{
                data.putId.value = 0
                openFragment()
            }
            contact2.setOnClickListener{
                data.putId.value = 1
                openFragment()
            }
            contact3.setOnClickListener{
                data.putId.value = 2
                openFragment()
            }
            contact4.setOnClickListener{
                data.putId.value = 3
                openFragment()
            }
            contact5.setOnClickListener{
                data.putId.value = 4
                openFragment()
            }
            }
    }


    companion object {
    }

}