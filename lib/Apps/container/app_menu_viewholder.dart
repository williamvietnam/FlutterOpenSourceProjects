import 'package:flutter/material.dart';
import 'package:flutter_open_source_projects/Apps/container/app.dart';

class AppsMenuViewHolder extends StatelessWidget {
  final App app;

  const AppsMenuViewHolder(this.app, {super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
      margin: const EdgeInsets.fromLTRB(4, 16, 4, 0),
      child: Column(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        crossAxisAlignment: CrossAxisAlignment.center,
        children: <Widget>[
          Expanded(child: Image(image: app.logo)),
          Container(
            margin: const EdgeInsets.fromLTRB(0, 8, 0, 0),
            child: Text(app.title,
                style: const TextStyle(
                    fontSize: 16,
                    fontWeight: FontWeight.bold,
                    color: Colors.black)),
          )
        ],
      ),
    );
  }
}
